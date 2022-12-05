package com.example.recipes_app.view.RecipesList;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class RecipesListFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private RecipesListFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private RecipesListFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static RecipesListFragmentArgs fromBundle(@NonNull Bundle bundle) {
    RecipesListFragmentArgs __result = new RecipesListFragmentArgs();
    bundle.setClassLoader(RecipesListFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("username")) {
      String username;
      username = bundle.getString("username");
      if (username == null) {
        throw new IllegalArgumentException("Argument \"username\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("username", username);
    } else {
      throw new IllegalArgumentException("Required argument \"username\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("category")) {
      String category;
      category = bundle.getString("category");
      if (category == null) {
        throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("category", category);
    } else {
      throw new IllegalArgumentException("Required argument \"category\" is missing and does not have an android:defaultValue");
    }
    return __result;
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

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    RecipesListFragmentArgs that = (RecipesListFragmentArgs) object;
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getUsername() != null ? getUsername().hashCode() : 0);
    result = 31 * result + (getCategory() != null ? getCategory().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "RecipesListFragmentArgs{"
        + "username=" + getUsername()
        + ", category=" + getCategory()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(RecipesListFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String username, @NonNull String category) {
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
    public RecipesListFragmentArgs build() {
      RecipesListFragmentArgs result = new RecipesListFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setUsername(@NonNull String username) {
      if (username == null) {
        throw new IllegalArgumentException("Argument \"username\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("username", username);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setCategory(@NonNull String category) {
      if (category == null) {
        throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("category", category);
      return this;
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
  }
}
