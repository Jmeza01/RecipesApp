package com.example.recipes_app.view.EditRecipe;

import androidx.annotation.NonNull;
import com.example.recipes_app.MobileNavigationDirections;
import java.lang.String;

public class EditRecipeFragmentDirections {
  private EditRecipeFragmentDirections() {
  }

  @NonNull
  public static MobileNavigationDirections.ActionGlobalMyAccountFragment actionGlobalMyAccountFragment(
      @NonNull String username) {
    return MobileNavigationDirections.actionGlobalMyAccountFragment(username);
  }

  @NonNull
  public static MobileNavigationDirections.ActionGlobalNewRecipeFragment actionGlobalNewRecipeFragment(
      @NonNull String username) {
    return MobileNavigationDirections.actionGlobalNewRecipeFragment(username);
  }

  @NonNull
  public static MobileNavigationDirections.ActionGlobalRecipesListFragment actionGlobalRecipesListFragment(
      @NonNull String username, @NonNull String category) {
    return MobileNavigationDirections.actionGlobalRecipesListFragment(username, category);
  }
}
