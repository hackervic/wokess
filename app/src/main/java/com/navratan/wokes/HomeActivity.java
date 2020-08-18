package com.navratan.wokes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;
import com.navratan.wokes.Adapter.BannerAdapter;
import com.navratan.wokes.Adapter.BestSellerAdapter;
import com.navratan.wokes.Adapter.CatagoryAdapter;
import com.navratan.wokes.Adapter.HappyCustomerAdapter;
import com.navratan.wokes.Adapter.SafetyAdapter;
import com.navratan.wokes.Model.BannerModel;
import com.navratan.wokes.Model.BestSellerModel;
import com.navratan.wokes.Model.CatagoryModel;
import com.navratan.wokes.Model.HappyCustomerModel;
import com.navratan.wokes.Model.SafetyModel;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView topbrandsRecyclerView, catrecyclerview, bestsellerview, safetyview, CustomerCommentView;
    private ImageView hamburger, cart, notification;
    private EditText Search;
    private LinearLayout linearLayout;
    private ImageSlider imageSlider;
    private Button contact;
    BannerAdapter bannerAdapter;
    CatagoryAdapter catagoryAdapter;
    BestSellerAdapter bestSellerAdapter;
    SafetyAdapter safetyAdapter;
    HappyCustomerAdapter happyCustomerAdapter;
    private List<BannerModel> bannerModels = new ArrayList<>();
    private List<CatagoryModel> catagoryModels = new ArrayList<>();
    private List<BestSellerModel> bestSellerModelList = new ArrayList<>();
    private List<SafetyModel> safetyModelList = new ArrayList<>();
    private List<HappyCustomerModel> happyCustomerModels = new ArrayList<>();
    private List<SlideModel> slider_list = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        topbrandsRecyclerView = findViewById(R.id.topbrands);
        imageSlider = findViewById(R.id.image_slider);
        catrecyclerview = findViewById(R.id.catgories_recycler_view);
        bestsellerview = findViewById(R.id.bestseller_recycler);
        CustomerCommentView = findViewById(R.id.hcustomer_recycler_view);
        notification = findViewById(R.id.notification);
        cart = findViewById(R.id.cart_icon);
        contact = findViewById(R.id.contact_us);

        hamburger = findViewById(R.id.navigation_icon);
        linearLayout = findViewById(R.id.all_cat_layout);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, AllCatagory.class));
            }
        });
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, CartActivity.class));
            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, ProductDetails.class));
            }
        });
        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, NavigationActivity.class));
            }
        });

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, ThankYouActivity.class));

            }
        });
        ShowCatagory();
        ShowImageSlider();
        ShowBanner();
        ShowBestSeller();
        ShowSafety();
        ShowHappyCustomerComment();

    }





    @SuppressLint("ClickableViewAccessibility")
    private void ShowImageSlider() {

        SlideModel slideModel1 = new SlideModel("https://bit.ly/2YoJ77H", "The animal population decreased by 58 percent in 42 years.", ScaleTypes.FIT);
        SlideModel slideModel2 = new SlideModel("https://bit.ly/2BteuF2", "Elephants and tigers may become extinct", ScaleTypes.FIT);
        SlideModel slideModel3 = new SlideModel("https://bit.ly/3fLJf72", "And people do that.", ScaleTypes.FIT);
        SlideModel slideModel4 = new SlideModel("https://bit.ly/2BteuF2", "Elephants and tigers may become extinct", ScaleTypes.FIT);
        SlideModel slideModel5 = new SlideModel("https://bit.ly/3fLJf72", "And people do that.", ScaleTypes.FIT);
        slider_list.add(slideModel1);
        slider_list.add(slideModel2);
        slider_list.add(slideModel3);
        slider_list.add(slideModel4);
        slider_list.add(slideModel5);
        imageSlider.setImageList(slider_list, ScaleTypes.FIT);
        imageSlider.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemSelected(int i) {
                imageSlider.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        final GestureDetector gestureDetector = new GestureDetector(new GestureDetector.SimpleOnGestureListener() {
                            public void onLongPress(MotionEvent e) {
                                imageSlider.stopSliding();
                            }

                        });
                        return gestureDetector.onTouchEvent(event);
                    }

                });
            }
        });


    }

    private void ShowHappyCustomerComment() {

        happyCustomerAdapter = new HappyCustomerAdapter(happyCustomerModels);
        HappyCustomerModel happyCustomerModel = new HappyCustomerModel("Sanskar Jha", "Jabalpur", "Lorem ipsum dolor sit amet, alterum pertinacia sit ea. Putent euismod in his. Mea an graeci utamur deseruisse, vix id doming option.", "https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/profile.png?alt=media&token=d6447fa3-23b0-4d34-a31c-245b6b6888fd");
        HappyCustomerModel happyCustomerModel1 = new HappyCustomerModel("Aman Tiwari", "Bhopal", "Lorem ipsum dolor sit amet, alterum pertinacia sit ea. Putent euismod in his. Mea an graeci utamur deseruisse, vix id doming option.", "https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/profile.png?alt=media&token=d6447fa3-23b0-4d34-a31c-245b6b6888fd");
        HappyCustomerModel happyCustomerMode2 = new HappyCustomerModel("Salman Ali", "Indore", "Lorem ipsum dolor sit amet, alterum pertinacia sit ea. Putent euismod in his. Mea an graeci utamur deseruisse, vix id doming option.", "https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/profile.png?alt=media&token=d6447fa3-23b0-4d34-a31c-245b6b6888fd");
        HappyCustomerModel happyCustomerMode3 = new HappyCustomerModel("Shweta Pandey", "Jabalpur", "Lorem ipsum dolor sit amet, alterum pertinacia sit ea. Putent euismod in his. Mea an graeci utamur deseruisse, vix id doming option.", "https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/profile.png?alt=media&token=d6447fa3-23b0-4d34-a31c-245b6b6888fd");
        HappyCustomerModel happyCustomerMode4 = new HappyCustomerModel("Vanshika Ramje", "Delhi", "Lorem ipsum dolor sit amet, alterum pertinacia sit ea. Putent euismod in his. Mea an graeci utamur deseruisse, vix id doming option.", "https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/profile.png?alt=media&token=d6447fa3-23b0-4d34-a31c-245b6b6888fd");
        happyCustomerModels.add(happyCustomerModel1);
        happyCustomerModels.add(happyCustomerMode2);
        happyCustomerModels.add(happyCustomerMode4);
        happyCustomerModels.add(happyCustomerMode3);
        happyCustomerModels.add(happyCustomerModel);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        CustomerCommentView.setLayoutManager(layoutManager);
        CustomerCommentView.setAdapter(happyCustomerAdapter);
        CustomerCommentView.setHasFixedSize(true);
    }

    private void ShowSafety() {

        safetyview = findViewById(R.id.seafty_measure_view);
        safetyAdapter = new SafetyAdapter(safetyModelList);
        SafetyModel safetyModel = new SafetyModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/s1.png?alt=media&token=1632344d-a36e-47d0-8875-df62b31a1fa6");
        SafetyModel safetyModel1 = new SafetyModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/s2%20(2).png?alt=media&token=ef930e5a-fdd9-4c01-8ab7-e88f06e6d4d5");
        SafetyModel safetyModel2 = new SafetyModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/s3.png?alt=media&token=be6eb36d-6977-48ff-a33f-68682b83065f");
        SafetyModel safetyModel3 = new SafetyModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/s4.png?alt=media&token=23c7699d-64a1-44f9-b360-cb57b037c5da");
        safetyModelList.add(safetyModel);
        safetyModelList.add(safetyModel1);
        safetyModelList.add(safetyModel2);
        safetyModelList.add(safetyModel3);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        safetyview.setLayoutManager(layoutManager);
        safetyview.setAdapter(safetyAdapter);
        safetyview.setHasFixedSize(true);

    }

    private void ShowBestSeller() {
        BestSellerModel bestSellerModel1;
        bestSellerModel1 = new BestSellerModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/anand_bhandar.jpg?alt=media&token=36c6e789-c353-42db-a6fb-106ff3fff966", "Anand Bhandar", "Bus Stand Wright Town", "10", "2.5");
        bestSellerModelList.add(bestSellerModel1);

        BestSellerModel bestSellerModel2 = new BestSellerModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/ksm.jpg?alt=media&token=84aa54e3-1fd2-41f5-ace0-7bca2d15c0ed", "Khandelwal Supermart", "Malviya Chowk", "20", "4.5");
        bestSellerModelList.add(bestSellerModel2);

        BestSellerModel bestSellerModel3 = new BestSellerModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/rms.jpg?alt=media&token=fdd65120-07b3-4660-8e9a-b9e836c002d9", "Ramesh Medicose", "Dawa Market", "15", "2.0");
        bestSellerModelList.add(bestSellerModel3);

        BestSellerModel bestSellerModel4 = new BestSellerModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/vg.jpg?alt=media&token=26a3fd9e-1e69-4bae-ab99-687c1949002e", "Vegetable King", "Gorakhpur", "12", "5.0");
        bestSellerModelList.add(bestSellerModel4);

        bestSellerModel1 = new BestSellerModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/anand_bhandar.jpg?alt=media&token=36c6e789-c353-42db-a6fb-106ff3fff966", "Anand Bhandar", "Bus Stand Wright Town", "10", "2.5");
        bestSellerModelList.add(bestSellerModel1);

        BestSellerModel bestSellerModel5 = new BestSellerModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/ksm.jpg?alt=media&token=84aa54e3-1fd2-41f5-ace0-7bca2d15c0ed", "Khandelwal Supermart", "Malviya Chowk", "20", "4.5");
        bestSellerModelList.add(bestSellerModel5);

        BestSellerModel bestSellerModel6 = new BestSellerModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/rms.jpg?alt=media&token=fdd65120-07b3-4660-8e9a-b9e836c002d9", "Ramesh Medicose", "Dawa Market", "15", "2.0");
        bestSellerModelList.add(bestSellerModel6);

        BestSellerModel bestSellerModel7 = new BestSellerModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/vg.jpg?alt=media&token=26a3fd9e-1e69-4bae-ab99-687c1949002e", "Vegetable King", "Gorakhpur", "12", "5.0");
        bestSellerModelList.add(bestSellerModel7);

        LinearLayoutManager layoutManager = new GridLayoutManager(this, 2);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        bestsellerview.setLayoutManager(layoutManager);
        bestSellerAdapter = new BestSellerAdapter(bestSellerModelList);
        bestsellerview.setAdapter(bestSellerAdapter);
        bestsellerview.setHasFixedSize(true);


    }

    private void ShowCatagory() {
        catagoryAdapter = new CatagoryAdapter(catagoryModels);
        CatagoryModel catagoryModel = new CatagoryModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/food.png?alt=media&token=d4cc5c85-b8f8-4d14-a55e-62d3769e1e05", "Vegetables");
        catagoryModels.add(catagoryModel);

        CatagoryModel catagoryMode2 = new CatagoryModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/medicine.png?alt=media&token=56a7a53c-53fb-4b9b-bd7b-ccf195553d72", "Medicine");
        catagoryModels.add(catagoryMode2);

        CatagoryModel catagoryMode3 = new CatagoryModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/supermarket.png?alt=media&token=be2cf427-44b2-4d60-8129-f16b2faa9653", "Grocery");
        catagoryModels.add(catagoryMode3);

        CatagoryModel catagoryModel4 = new CatagoryModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/smartphone%20(1).png?alt=media&token=62c65726-5d5f-431a-93ab-b74973957309", "Electronics");
        catagoryModels.add(catagoryModel4);

        CatagoryModel catagoryModel7 = new CatagoryModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/beauty.png?alt=media&token=54de4ac4-5eb5-408d-9c0e-34edf6d80804", "Beauty");
        catagoryModels.add(catagoryModel7);

        LinearLayoutManager LayoutManager = new LinearLayoutManager(getApplicationContext());
        LayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        catrecyclerview.setLayoutManager(LayoutManager);
        catrecyclerview.setAdapter(catagoryAdapter);
        catrecyclerview.setHasFixedSize(true);

    }

    private void ShowBanner() {
        bannerAdapter = new BannerAdapter(bannerModels);
        BannerModel bannerModel = new BannerModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/b1.png?alt=media&token=8f030824-8167-4dbf-af26-14643946cdf0");
        bannerModels.add(bannerModel);
        BannerModel bannerMode2 = new BannerModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/b2.png?alt=media&token=fd5b39cc-1421-46a5-b3d0-2be9968c15a9");
        bannerModels.add(bannerMode2);

        BannerModel bannerMode3 = new BannerModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/b3.png?alt=media&token=2e4d8ba0-dc8c-4a54-98c0-f39f6d0cba4a");
        bannerModels.add(bannerMode3);

        BannerModel bannerMode4 = new BannerModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/b4.png?alt=media&token=c923ecf7-5bea-4858-a604-f2fa70fc148c");
        bannerModels.add(bannerMode4);

        BannerModel bannerModel5 = new BannerModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/b1.png?alt=media&token=8f030824-8167-4dbf-af26-14643946cdf0");
        bannerModels.add(bannerModel5);
        BannerModel bannerMode6 = new BannerModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/b2.png?alt=media&token=fd5b39cc-1421-46a5-b3d0-2be9968c15a9");
        bannerModels.add(bannerMode6);

        BannerModel bannerMode7 = new BannerModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/b3.png?alt=media&token=2e4d8ba0-dc8c-4a54-98c0-f39f6d0cba4a");
        bannerModels.add(bannerMode7);

        BannerModel bannerMode8 = new BannerModel("https://firebasestorage.googleapis.com/v0/b/havocquizzer.appspot.com/o/b4.png?alt=media&token=c923ecf7-5bea-4858-a604-f2fa70fc148c");
        bannerModels.add(bannerMode8);


        LinearLayoutManager LayoutManager = new LinearLayoutManager(getApplicationContext());
        LayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        topbrandsRecyclerView.setLayoutManager(LayoutManager);
        topbrandsRecyclerView.setAdapter(bannerAdapter);
        topbrandsRecyclerView.setHasFixedSize(true);
    }

}


