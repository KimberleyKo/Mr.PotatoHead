package com.example.kimberley.mrpotatoheadsecondapp;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import static com.example.kimberley.mrpotatoheadsecondapp.R.*;

public class MrPotatoHead_MainActivity extends AppCompatActivity {
    ImageView Ears;
    ImageView Shoes;
    ImageView Hat;
    ImageView Arms;
    ImageView Eyes;
    ImageView Eyebrows;
    ImageView Glasses;
    ImageView Mouth;
    ImageView Mustache;
    ImageView Nose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_mr_potato_head__main);

    }

    public void checkAll(View view) {
        switch (view.getId()) {
            case id.checkboxEars :
                Ears = (ImageView) findViewById(id.Ears);
                Ears.setVisibility(Ears.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case id.checkboxArms :
                Arms = (ImageView) findViewById(id.Arms);
                Arms.setVisibility(Arms.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case id.checkboxShoes :
                Shoes = (ImageView) findViewById(id.Shoes);
                Shoes.setVisibility(Shoes.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case id.checkboxEyebrows :
                Eyebrows = (ImageView) findViewById(id.Eyebrows);
                Eyebrows.setVisibility(Eyebrows.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case id.checkboxEyes :
                Eyes = (ImageView) findViewById(id.Eyes);
                Eyes.setVisibility(Eyes.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case id.checkboxGlasses :
                Glasses = (ImageView) findViewById(id.Glasses);
                Glasses.setVisibility(Glasses.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case id.checkboxMouth :
                Mouth = (ImageView) findViewById(id.Mouth);
                Mouth.setVisibility(Mouth.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case id.checkboxNose :
                Nose = (ImageView) findViewById(id.Nose);
                Nose.setVisibility(Nose.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case id.checkboxMustache :
                Mustache = (ImageView) findViewById(id.Mustache);
                Mustache.setVisibility(Mustache.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case id.checkboxHat :
                Hat = (ImageView) findViewById(id.Hat);
                Hat.setVisibility(Hat.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
        }
    }

    }


