package com.example.recipes_app.view.MyAccount;

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

public class MyAccountFragmentDirections {
  private MyAccountFragmentDirections() {
  }

  @NonNull
  public static ActionMyAccountNavToRecipesListFragment actionMyAccountNavToRecipesListFragment(
      @NonNull String username, @NonNull String category) {
    return new ActionMyAccountNavToRecipesListFragment(username, category);
  }

  @NonNull
  public static ActionMyAccountNavToEditMyAccountFragment actionMyAccountNavToEditMyAccountFragment(
      @NonNull String username) {
    return new ActionMyAccountNavToEditMyAccountFragment(username);
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

  public static class ActionMyAccountNavToRecipesListFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionMyAccountNavToRecipesListFragment(@NonNull String username,
        @NonNull String category) {
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
    public ActionMyAccountNavToRecipesListFragment setUsername(@NonNull String username) {
      if (username == null) {
        throw new IllegalArgumentException("Argument \"username\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("username", username);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionMyAccountNavToRecipesListFragment setCategory(@NonNull String category) {
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
      return R.id.action_myAccount_nav_to_recipesListFragment;
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
      ActionMyAccountNavToRecipesListFragment that = (ActionMyAccountNavToRecipesListFragment) object;
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
      result = 31 * result + (getUsername() != null ? getUsername().hashCode() : 0);
      result = 31 * result + (getCategory() != null ? getCategory().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionMyAccountNavToRecipesListFragment(actionId=" + getActionId() + "){"
          + "username=" + getUsername()
          + ", category=" + getCategory()
          + "}";
    }
  }

  public static class ActionMyAccountNavToEditMyAccountFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionMyAccountNavToEditMyAccountFragment(@NonNull String username) {
      if (username == null) {
        throw new IllegalArgumentException("Argument \"username\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("username", username);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionMyAccountNavToEditMyAccountFragment setUsername(@NonNull String username) {
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
      return R.id.action_myAccount_nav_to_editMyAccountFragment;
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
      ActionMyAccountNavToEditMyAccountFragment that = (ActionMyAccountNavToEditMyAccountFragment) object;
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
      return "ActionMyAccountNavToEditMyAccountFragment(actionId=" + getActionId() + "){"
          + "username=" + getUsername()
          + "}";
    }
  }
}
