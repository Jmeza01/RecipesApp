package com.example.recipes_app.view.RecipesList;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.recipes_app.MobileNavigationDirections;
import com.example.recipes_app.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class RecipesListFragmentDirections {
  private RecipesListFragmentDirections() {
  }

  @NonNull
  public static ActionRecipesListFragmentToRecipeFragment actionRecipesListFragmentToRecipeFragment(
      @NonNull String recipeId, @NonNull String username) {
    return new ActionRecipesListFragmentToRecipeFragment(recipeId, username);
  }

  @NonNull
  public static ActionRecipesListFragmentToNewRecipeFragment actionRecipesListFragmentToNewRecipeFragment(
      @NonNull String username) {
    return new ActionRecipesListFragmentToNewRecipeFragment(username);
  }

  @NonNull
  public static ActionRecipesListFragmentToEditRecipeFragment actionRecipesListFragmentToEditRecipeFragment(
      @NonNull String recipeId, @NonNull String username, @NonNull String category) {
    return new ActionRecipesListFragmentToEditRecipeFragment(recipeId, username, category);
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

  public static class ActionRecipesListFragmentToRecipeFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionRecipesListFragmentToRecipeFragment(@NonNull String recipeId,
        @NonNull String username) {
      if (recipeId == null) {
        throw new IllegalArgumentException("Argument \"recipeId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("recipeId", recipeId);
      if (username == null) {
        throw new IllegalArgumentException("Argument \"username\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("username", username);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionRecipesListFragmentToRecipeFragment setRecipeId(@NonNull String recipeId) {
      if (recipeId == null) {
        throw new IllegalArgumentException("Argument \"recipeId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("recipeId", recipeId);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionRecipesListFragmentToRecipeFragment setUsername(@NonNull String username) {
      if (username == null) {
        throw new IllegalArgumentException("Argument \"username\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("username", username);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("recipeId")) {
        String recipeId = (String) arguments.get("recipeId");
        __result.putString("recipeId", recipeId);
      }
      if (arguments.containsKey("username")) {
        String username = (String) arguments.get("username");
        __result.putString("username", username);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_recipesListFragment_to_recipeFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getRecipeId() {
      return (String) arguments.get("recipeId");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getUsername() {
      return (String) arguments.get("username");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionRecipesListFragmentToRecipeFragment that = (ActionRecipesListFragmentToRecipeFragment) object;
      if (arguments.containsKey("recipeId") != that.arguments.containsKey("recipeId")) {
        return false;
      }
      if (getRecipeId() != null ? !getRecipeId().equals(that.getRecipeId()) : that.getRecipeId() != null) {
        return false;
      }
      if (arguments.containsKey("username") != that.arguments.containsKey("username")) {
        return false;
      }
      if (getUsername() != null ? !getUsername().equals(that.getUsername()) : that.getUsername() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getRecipeId() != null ? getRecipeId().hashCode() : 0);
      result = 31 * result + (getUsername() != null ? getUsername().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionRecipesListFragmentToRecipeFragment(actionId=" + getActionId() + "){"
          + "recipeId=" + getRecipeId()
          + ", username=" + getUsername()
          + "}";
    }
  }

  public static class ActionRecipesListFragmentToNewRecipeFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionRecipesListFragmentToNewRecipeFragment(@NonNull String username) {
      if (username == null) {
        throw new IllegalArgumentException("Argument \"username\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("username", username);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionRecipesListFragmentToNewRecipeFragment setUsername(@NonNull String username) {
      if (username == null) {
        throw new IllegalArgumentException("Argument \"username\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("username", username);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("username")) {
        String username = (String) arguments.get("username");
        __result.putString("username", username);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_recipesListFragment_to_newRecipeFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getUsername() {
      return (String) arguments.get("username");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionRecipesListFragmentToNewRecipeFragment that = (ActionRecipesListFragmentToNewRecipeFragment) object;
      if (arguments.containsKey("username") != that.arguments.containsKey("username")) {
        return false;
      }
      if (getUsername() != null ? !getUsername().equals(that.getUsername()) : that.getUsername() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getUsername() != null ? getUsername().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionRecipesListFragmentToNewRecipeFragment(actionId=" + getActionId() + "){"
          + "username=" + getUsername()
          + "}";
    }
  }

  public static class ActionRecipesListFragmentToEditRecipeFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionRecipesListFragmentToEditRecipeFragment(@NonNull String recipeId,
        @NonNull String username, @NonNull String category) {
      if (recipeId == null) {
        throw new IllegalArgumentException("Argument \"recipeId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("recipeId", recipeId);
      if (username == null) {
        throw new IllegalArgumentException("Argument \"username\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("username", username);
      if (category == null) {
        throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("category", category);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionRecipesListFragmentToEditRecipeFragment setRecipeId(@NonNull String recipeId) {
      if (recipeId == null) {
        throw new IllegalArgumentException("Argument \"recipeId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("recipeId", recipeId);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionRecipesListFragmentToEditRecipeFragment setUsername(@NonNull String username) {
      if (username == null) {
        throw new IllegalArgumentException("Argument \"username\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("username", username);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionRecipesListFragmentToEditRecipeFragment setCategory(@NonNull String category) {
      if (category == null) {
        throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("category", category);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("recipeId")) {
        String recipeId = (String) arguments.get("recipeId");
        __result.putString("recipeId", recipeId);
      }
      if (arguments.containsKey("username")) {
        String username = (String) arguments.get("username");
        __result.putString("username", username);
      }
      if (arguments.containsKey("category")) {
        String category = (String) arguments.get("category");
        __result.putString("category", category);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_recipesListFragment_to_editRecipeFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getRecipeId() {
      return (String) arguments.get("recipeId");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getUsername() {
      return (String) arguments.get("username");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getCategory() {
      return (String) arguments.get("category");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionRecipesListFragmentToEditRecipeFragment that = (ActionRecipesListFragmentToEditRecipeFragment) object;
      if (arguments.containsKey("recipeId") != that.arguments.containsKey("recipeId")) {
        return false;
      }
      if (getRecipeId() != null ? !getRecipeId().equals(that.getRecipeId()) : that.getRecipeId() != null) {
        return false;
      }
      if (arguments.containsKey("username") != that.arguments.containsKey("username")) {
        return false;
      }
      if (getUsername() != null ? !getUsername().equals(that.getUsername()) : that.getUsername() != null) {
        return false;
      }
      if (arguments.containsKey("category") != that.arguments.containsKey("category")) {
        return false;
      }
      if (getCategory() != null ? !getCategory().equals(that.getCategory()) : that.getCategory() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getRecipeId() != null ? getRecipeId().hashCode() : 0);
      result = 31 * result + (getUsername() != null ? getUsername().hashCode() : 0);
      result = 31 * result + (getCategory() != null ? getCategory().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionRecipesListFragmentToEditRecipeFragment(actionId=" + getActionId() + "){"
          + "recipeId=" + getRecipeId()
          + ", username=" + getUsername()
          + ", category=" + getCategory()
          + "}";
    }
  }
}
