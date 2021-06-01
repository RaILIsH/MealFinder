package com.example.rgb;

import android.content.Intent;
import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SettingsInfo extends AppCompatActivity {
    ImageView back,accept;
    private static final String TAG = "SettingsInfo";
    private static final String KEY_DESCRIPTION = "description";
    String id = UUID.randomUUID().toString();
    private EditText problem;
    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String whatisthis=getIntent().getStringExtra("whatisthis");
        if(whatisthis.equals("howtouse")){
            setContentView(R.layout.howtouse);
        }
        else if(whatisthis.equals("call")){
            setContentView(R.layout.call);
            problem=(EditText) findViewById(R.id.problem);
            back=(ImageView) findViewById(R.id.backproblem);
            accept=(ImageView) findViewById(R.id.acceptproblem);
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });
            accept.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String description=problem.getText().toString();
                    Map <String,Object> note = new HashMap<>();
                    note.put(KEY_DESCRIPTION,description);
                     if(problem.getText().toString().equals("")){
                         Toast.makeText(SettingsInfo.this,"Вы ничего не ввели",Toast.LENGTH_SHORT).show();
                     }
                     else if(problem.getText().toString().length()<25){
                         Toast.makeText(SettingsInfo.this,"Сообщение должно содержать не менее 25 символов",Toast.LENGTH_SHORT).show();
                     }
                     else if(problem.getText().toString().length()>300){
                         Toast.makeText(SettingsInfo.this,"Сообщение должно содержать не более 300 символов",Toast.LENGTH_SHORT).show();
                     }
                     else{
                         problem.setText("");
                         db.collection("Problems").document(id).set(note)
                                 .addOnSuccessListener(new OnSuccessListener<Void>() {
                                     @Override
                                     public void onSuccess(Void aVoid) {
                                         Toast.makeText(SettingsInfo.this,"Запрос отправлен",Toast.LENGTH_SHORT).show();
                                         onBackPressed();
                                     }
                                 })
                                 .addOnFailureListener(new OnFailureListener() {
                                     @Override
                                     public void onFailure(@NonNull Exception e) {
                                         Toast.makeText(SettingsInfo.this,"Ошибка! Нет подключения к Интернету.",Toast.LENGTH_SHORT).show();
                                     }
                                 });
                     }
                }
            });
        }
    }
}
