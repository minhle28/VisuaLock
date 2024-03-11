// Generated by view binder compiler. Do not edit!
package com.example.visualock.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.visualock.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView LoginCardView;

  @NonNull
  public final TextView forgotPassRedirectText;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final EditText loginEmail;

  @NonNull
  public final EditText loginPassword;

  @NonNull
  public final TextView registerRedirectText;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull CardView LoginCardView,
      @NonNull TextView forgotPassRedirectText, @NonNull Button loginButton,
      @NonNull EditText loginEmail, @NonNull EditText loginPassword,
      @NonNull TextView registerRedirectText) {
    this.rootView = rootView;
    this.LoginCardView = LoginCardView;
    this.forgotPassRedirectText = forgotPassRedirectText;
    this.loginButton = loginButton;
    this.loginEmail = loginEmail;
    this.loginPassword = loginPassword;
    this.registerRedirectText = registerRedirectText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.LoginCardView;
      CardView LoginCardView = ViewBindings.findChildViewById(rootView, id);
      if (LoginCardView == null) {
        break missingId;
      }

      id = R.id.forgot_passRedirectText;
      TextView forgotPassRedirectText = ViewBindings.findChildViewById(rootView, id);
      if (forgotPassRedirectText == null) {
        break missingId;
      }

      id = R.id.login_button;
      Button loginButton = ViewBindings.findChildViewById(rootView, id);
      if (loginButton == null) {
        break missingId;
      }

      id = R.id.login_email;
      EditText loginEmail = ViewBindings.findChildViewById(rootView, id);
      if (loginEmail == null) {
        break missingId;
      }

      id = R.id.login_password;
      EditText loginPassword = ViewBindings.findChildViewById(rootView, id);
      if (loginPassword == null) {
        break missingId;
      }

      id = R.id.registerRedirectText;
      TextView registerRedirectText = ViewBindings.findChildViewById(rootView, id);
      if (registerRedirectText == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, LoginCardView,
          forgotPassRedirectText, loginButton, loginEmail, loginPassword, registerRedirectText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
