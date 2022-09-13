package com.example.recyclerviewassigment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements OnItemClickListener{
    private RecyclerView mRecyclerView;
    private Adapter mAdapter;

    Recipes recipe1 = new Recipes("Heading 1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
    Recipes recipe2 = new Recipes("Heading 2", "Eget magna fermentum iaculis eu non diam phasellus vestibulum. Eget mauris pharetra et ultrices neque ornare aenean. Ac placerat vestibulum lectus mauris. Urna cursus eget nunc scelerisque viverra mauris in aliquam. Sed euismod nisi porta lorem. Pellentesque eu tincidunt tortor aliquam nulla. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Gravida cum sociis natoque penatibus et magnis dis parturient. Sit amet dictum sit amet justo donec enim diam. Nunc non blandit massa enim nec dui nunc.");
    Recipes recipe3 = new Recipes("Heading 3", "Non pulvinar neque laoreet suspendisse interdum consectetur. Cursus turpis massa tincidunt dui ut ornare. Urna cursus eget nunc scelerisque viverra mauris in. Lorem donec massa sapien faucibus et. Facilisis sed odio morbi quis commodo odio aenean sed. Sit amet nulla facilisi morbi tempus. Nunc sed id semper risus in hendrerit gravida. Justo laoreet sit amet cursus sit amet dictum sit. Nulla facilisi morbi tempus iaculis urna. Condimentum lacinia quis vel eros donec ac odio. Mattis nunc sed blandit libero. Elit ut aliquam purus sit amet.");
    Recipes recipe4 = new Recipes("Heading 4", "Eget magna fermentum iaculis eu non diam phasellus vestibulum. Eget mauris pharetra et ultrices neque ornare aenean. Ac placerat vestibulum lectus mauris. Urna cursus eget nunc scelerisque viverra mauris in aliquam. Sed euismod nisi porta lorem. Pellentesque eu tincidunt tortor aliquam nulla. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Gravida cum sociis natoque penatibus et magnis dis parturient. Sit amet dictum sit amet justo donec enim diam. Nunc non blandit massa enim nec dui nunc.");
    Recipes recipe5 = new Recipes("Heading 5", "Non odio euismod lacinia at quis risus sed. Sit amet aliquam id diam maecenas ultricies mi. Convallis posuere morbi leo urna molestie at elementum eu. Imperdiet nulla malesuada pellentesque elit eget gravida cum sociis. Auctor neque vitae tempus quam pellentesque nec nam aliquam sem. Varius sit amet mattis vulputate enim nulla aliquet porttitor. Sagittis vitae et leo duis. Elementum tempus egestas sed sed risus pretium quam vulputate. Mi in nulla posuere sollicitudin. Et netus et malesuada fames ac turpis.");
    Recipes recipe6 = new Recipes("Heading 6", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
    Recipes recipe7 = new Recipes("Heading 7", "Eget magna fermentum iaculis eu non diam phasellus vestibulum. Eget mauris pharetra et ultrices neque ornare aenean. Ac placerat vestibulum lectus mauris. Urna cursus eget nunc scelerisque viverra mauris in aliquam. Sed euismod nisi porta lorem. Pellentesque eu tincidunt tortor aliquam nulla. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Gravida cum sociis natoque penatibus et magnis dis parturient. Sit amet dictum sit amet justo donec enim diam. Nunc non blandit massa enim nec dui nunc.");
    Recipes recipe8 = new Recipes("Heading 8", "Non pulvinar neque laoreet suspendisse interdum consectetur. Cursus turpis massa tincidunt dui ut ornare. Urna cursus eget nunc scelerisque viverra mauris in. Lorem donec massa sapien faucibus et. Facilisis sed odio morbi quis commodo odio aenean sed. Sit amet nulla facilisi morbi tempus. Nunc sed id semper risus in hendrerit gravida. Justo laoreet sit amet cursus sit amet dictum sit. Nulla facilisi morbi tempus iaculis urna. Condimentum lacinia quis vel eros donec ac odio. Mattis nunc sed blandit libero. Elit ut aliquam purus sit amet.");
    Recipes recipe9 = new Recipes("Heading 9", "Eget magna fermentum iaculis eu non diam phasellus vestibulum. Eget mauris pharetra et ultrices neque ornare aenean. Ac placerat vestibulum lectus mauris. Urna cursus eget nunc scelerisque viverra mauris in aliquam. Sed euismod nisi porta lorem. Pellentesque eu tincidunt tortor aliquam nulla. Est lorem ipsum dolor sit amet consectetur adipiscing elit. Gravida cum sociis natoque penatibus et magnis dis parturient. Sit amet dictum sit amet justo donec enim diam. Nunc non blandit massa enim nec dui nunc.");
    Recipes recipe10 = new Recipes("Heading 10", "Non odio euismod lacinia at quis risus sed. Sit amet aliquam id diam maecenas ultricies mi. Convallis posuere morbi leo urna molestie at elementum eu. Imperdiet nulla malesuada pellentesque elit eget gravida cum sociis. Auctor neque vitae tempus quam pellentesque nec nam aliquam sem. Varius sit amet mattis vulputate enim nulla aliquet porttitor. Sagittis vitae et leo duis. Elementum tempus egestas sed sed risus pretium quam vulputate. Mi in nulla posuere sollicitudin. Et netus et malesuada fames ac turpis.");

    private ArrayList recipeList = new ArrayList<Recipes>(Arrays.asList(recipe1, recipe2, recipe3, recipe4, recipe5, recipe6, recipe7, recipe8, recipe9, recipe10));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mAdapter = new Adapter(this, recipeList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter.setClickListener((OnItemClickListener) this);
    }


    public void onClick(View view) {
        Intent intent = new Intent(this, FullActivity.class);
        Log.i("This is view", String.valueOf(view));
        intent.putExtra("Detailed",((TextView)view).getText());
        startActivity(intent);
        //Toast.makeText(this, "This is a toast", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view, int position) {

    }
}