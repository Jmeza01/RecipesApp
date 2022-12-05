package com.example.recipes_app.view.login;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.recipes_app.R;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLoginFragmentToSignupFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_signupFragment);
  }
}
