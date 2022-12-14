// Generated by view binder compiler. Do not edit!
package com.example.recipes_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.recipes_app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNewRecipeBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageButton deleteImgBtn;

  @NonNull
  public final ImageButton newRecCameraBtn;

  @NonNull
  public final Button newRecCancelBtn;

  @NonNull
  public final ImageButton newRecGalleryBtn;

  @NonNull
  public final EditText newRecIngredients;

  @NonNull
  public final EditText newRecMethod;

  @NonNull
  public final ProgressBar newRecProgressbar;

  @NonNull
  public final Button newRecSaveBtn;

  @NonNull
  public final Spinner newRecSpinner;

  @NonNull
  public final TextView newRecUsernameTv;

  @NonNull
  public final ImageView newRecipeImageRecipe;

  @NonNull
  public final EditText peNameOfRec;

  @NonNull
  public final TextView recipeNameTv;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  private FragmentNewRecipeBinding(@NonNull ScrollView rootView, @NonNull ImageButton deleteImgBtn,
      @NonNull ImageButton newRecCameraBtn, @NonNull Button newRecCancelBtn,
      @NonNull ImageButton newRecGalleryBtn, @NonNull EditText newRecIngredients,
      @NonNull EditText newRecMethod, @NonNull ProgressBar newRecProgressbar,
      @NonNull Button newRecSaveBtn, @NonNull Spinner newRecSpinner,
      @NonNull TextView newRecUsernameTv, @NonNull ImageView newRecipeImageRecipe,
      @NonNull EditText peNameOfRec, @NonNull TextView recipeNameTv, @NonNull TextView textView3,
      @NonNull TextView textView4, @NonNull TextView textView6, @NonNull TextView textView7) {
    this.rootView = rootView;
    this.deleteImgBtn = deleteImgBtn;
    this.newRecCameraBtn = newRecCameraBtn;
    this.newRecCancelBtn = newRecCancelBtn;
    this.newRecGalleryBtn = newRecGalleryBtn;
    this.newRecIngredients = newRecIngredients;
    this.newRecMethod = newRecMethod;
    this.newRecProgressbar = newRecProgressbar;
    this.newRecSaveBtn = newRecSaveBtn;
    this.newRecSpinner = newRecSpinner;
    this.newRecUsernameTv = newRecUsernameTv;
    this.newRecipeImageRecipe = newRecipeImageRecipe;
    this.peNameOfRec = peNameOfRec;
    this.recipeNameTv = recipeNameTv;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView6 = textView6;
    this.textView7 = textView7;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNewRecipeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNewRecipeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_new_recipe, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNewRecipeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.deleteImg_btn;
      ImageButton deleteImgBtn = ViewBindings.findChildViewById(rootView, id);
      if (deleteImgBtn == null) {
        break missingId;
      }

      id = R.id.newRec_camera_btn;
      ImageButton newRecCameraBtn = ViewBindings.findChildViewById(rootView, id);
      if (newRecCameraBtn == null) {
        break missingId;
      }

      id = R.id.newRec_cancel_btn;
      Button newRecCancelBtn = ViewBindings.findChildViewById(rootView, id);
      if (newRecCancelBtn == null) {
        break missingId;
      }

      id = R.id.newRec_gallery_btn;
      ImageButton newRecGalleryBtn = ViewBindings.findChildViewById(rootView, id);
      if (newRecGalleryBtn == null) {
        break missingId;
      }

      id = R.id.newRec_ingredients;
      EditText newRecIngredients = ViewBindings.findChildViewById(rootView, id);
      if (newRecIngredients == null) {
        break missingId;
      }

      id = R.id.newRec_method;
      EditText newRecMethod = ViewBindings.findChildViewById(rootView, id);
      if (newRecMethod == null) {
        break missingId;
      }

      id = R.id.newRec_progressbar;
      ProgressBar newRecProgressbar = ViewBindings.findChildViewById(rootView, id);
      if (newRecProgressbar == null) {
        break missingId;
      }

      id = R.id.newRec_save_btn;
      Button newRecSaveBtn = ViewBindings.findChildViewById(rootView, id);
      if (newRecSaveBtn == null) {
        break missingId;
      }

      id = R.id.newRec_spinner;
      Spinner newRecSpinner = ViewBindings.findChildViewById(rootView, id);
      if (newRecSpinner == null) {
        break missingId;
      }

      id = R.id.newRec_username_tv;
      TextView newRecUsernameTv = ViewBindings.findChildViewById(rootView, id);
      if (newRecUsernameTv == null) {
        break missingId;
      }

      id = R.id.newRecipe_image_recipe;
      ImageView newRecipeImageRecipe = ViewBindings.findChildViewById(rootView, id);
      if (newRecipeImageRecipe == null) {
        break missingId;
      }

      id = R.id.pe_nameOfRec;
      EditText peNameOfRec = ViewBindings.findChildViewById(rootView, id);
      if (peNameOfRec == null) {
        break missingId;
      }

      id = R.id.recipe_name_tv;
      TextView recipeNameTv = ViewBindings.findChildViewById(rootView, id);
      if (recipeNameTv == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      return new FragmentNewRecipeBinding((ScrollView) rootView, deleteImgBtn, newRecCameraBtn,
          newRecCancelBtn, newRecGalleryBtn, newRecIngredients, newRecMethod, newRecProgressbar,
          newRecSaveBtn, newRecSpinner, newRecUsernameTv, newRecipeImageRecipe, peNameOfRec,
          recipeNameTv, textView3, textView4, textView6, textView7);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
