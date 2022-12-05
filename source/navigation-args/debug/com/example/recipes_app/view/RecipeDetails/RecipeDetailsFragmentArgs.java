package com.example.recipes_app.view.RecipeDetails;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class RecipeDetailsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private RecipeDetailsFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private RecipeDetailsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static RecipeDetailsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    RecipeDetailsFragmentArgs __result = new RecipeDetailsFragmentArgs();
    bundle.setClassLoader(RecipeDetailsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("recipeId")) {
      String recipeId;
      recipeId = bundle.getString("recipeId");
      if (recipeId == null) {
        throw new IllegalArgumentException("Argument \"recipeId\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("recipeId", recipeId);
    } else {
      throw new IllegalArgumentException("Required argument \"recipeId\" is missing and does not have an android:defaultValue");
    }
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
    return __result;
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
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    RecipeDetailsFragmentArgs that = (RecipeDetailsFragmentArgs) object;
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getRecipeId() != null ? getRecipeId().hashCode() : 0);
    result = 31 * result + (getUsername() != null ? getUsername().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "RecipeDetailsFragmentArgs{"
        + "recipeId=" + getRecipeId()
        + ", username=" + getUsername()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(RecipeDetailsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String recipeId, @NonNull String username) {
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
    public RecipeDetailsFragmentArgs build() {
      RecipeDetailsFragmentArgs result = new RecipeDetailsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setRecipeId(@NonNull String recipeId) {
      if (recipeId == null) {
        throw new IllegalArgumentException("Argument \"recipeId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("recipeId", recipeId);
      return this;
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
  }
}
