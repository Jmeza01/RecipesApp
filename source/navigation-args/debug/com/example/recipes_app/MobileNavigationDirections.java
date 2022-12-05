package com.example.recipes_app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MobileNavigationDirections {
  private MobileNavigationDirections() {
  }

  @NonNull
  public static ActionGlobalMyAccountFragment actionGlobalMyAccountFragment(
      @NonNull String username) {
    return new ActionGlobalMyAccountFragment(username);
  }

  @NonNull
  public static ActionGlobalNewRecipeFragment actionGlobalNewRecipeFragment(
      @NonNull String username) {
    return new ActionGlobalNewRecipeFragment(username);
  }

  @NonNull
  public static ActionGlobalRecipesListFragment actionGlobalRecipesListFragment(
      @NonNull String username, @NonNull String category) {
    return new ActionGlobalRecipesListFragment(username, category);
  }

  public static class ActionGlobalMyAccountFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionGlobalMyAccountFragment(@NonNull String username) {
      if (username == null) {
        throw new IllegalArgumentException("Argument \"username\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("username", username);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionGlobalMyAccountFragment setUsername(@NonNull String username) {
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
      return R.id.action_global_myAccountFragment;
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
      ActionGlobalMyAccountFragment that = (ActionGlobalMyAccountFragment) object;
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
      return "ActionGlobalMyAccountFragment(actionId=" + getActionId() + "){"
          + "username=" + getUsername()
          + "}";
    }
  }

  public static class ActionGlobalNewRecipeFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionGlobalNewRecipeFragment(@NonNull String username) {
      if (username == null) {
        throw new IllegalArgumentException("Argument \"username\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("username", username);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionGlobalNewRecipeFragment setUsername(@NonNull String username) {
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
      return R.id.action_global_newRecipeFragment;
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
      ActionGlobalNewRecipeFragment that = (ActionGlobalNewRecipeFragment) object;
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
      return "ActionGlobalNewRecipeFragment(actionId=" + getActionId() + "){"
          + "username=" + getUsername()
          + "}";
    }
  }

  public static class ActionGlobalRecipesListFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionGlobalRecipesListFragment(@NonNull String username, @NonNull String category) {
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
    public ActionGlobalRecipesListFragment setUsername(@NonNull String username) {
      if (username == null) {
        throw new IllegalArgumentException("Argument \"username\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("username", username);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionGlobalRecipesListFragment setCategory(@NonNull String category) {
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
      return R.id.action_global_recipesListFragment;
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
      ActionGlobalRecipesListFragment that = (ActionGlobalRecipesListFragment) object;
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
      return "ActionGlobalRecipesListFragment(actionId=" + getActionId() + "){"
          + "username=" + getUsername()
          + ", category=" + getCategory()
          + "}";
    }
  }
}
