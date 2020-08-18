package com.navratan.wokes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.navratan.wokes.Adapter.FaqAdapter;
import com.navratan.wokes.Model.FaqModel;

import java.util.ArrayList;
import java.util.List;

public class FAQ extends AppCompatActivity {

    RecyclerView faqrecycle;
    FaqAdapter faqAdapter;
    ImageView backicon;

    List<FaqModel> faqModels = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_a_q);

        faqrecycle=findViewById(R.id.faq_recycler);
        faqAdapter=new FaqAdapter(faqModels);
        backicon=findViewById(R.id.faq_back);
        backicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FAQ.this,HomeActivity.class));
            }
        });

        FaqModel faqModel1 = new FaqModel("What is Wokes","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n" + "\n");
        FaqModel faqModel2 = new FaqModel("where is Wokes","Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source.");
        FaqModel faqModel3 = new FaqModel("What is ecommerce"," There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text.");
        FaqModel faqModel4 = new FaqModel("What ism Wokes","The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.");
        FaqModel faqModel5 = new FaqModel("What ism Wokes"," All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.");
        FaqModel faqModel6 = new FaqModel("What ism Wokes","It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");

        faqModels.add(faqModel1);
        faqModels.add(faqModel2);
        faqModels.add(faqModel3);
        faqModels.add(faqModel4);
        faqModels.add(faqModel5);
        faqModels.add(faqModel6);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(faqrecycle.getContext(),
                layoutManager.getOrientation());
        faqrecycle.addItemDecoration(dividerItemDecoration);
        faqrecycle.setLayoutManager(layoutManager);
        faqrecycle.setAdapter(faqAdapter);
        faqrecycle.setHasFixedSize(true);


    }
}