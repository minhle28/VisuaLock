// Generated by view binder compiler. Do not edit!
package com.example.visualock.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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

public final class ActivityForgotPasswordBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView ForgotPasswordCardView;

  @NonNull
  public final ImageView backButton;

  @NonNull
  public final EditText resetEmail;

  @NonNull
  public final Button sendResetButton;

  @NonNull
  public final TextView text;

  private ActivityForgotPasswordBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView ForgotPasswordCardView, @NonNull ImageView backButton,
      @NonNull EditText resetEmail, @NonNull Button sendResetButton, @NonNull TextView text) {
    this.rootView = rootView;
    this.ForgotPasswordCardView = ForgotPasswordCardView;
    this.backButton = backButton;
    this.resetEmail = resetEmail;
    this.sendResetButton = sendResetButton;
    this.text = text;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityForgotPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityForgotPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_forgot_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityForgotPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ForgotPasswordCardView;
      CardView ForgotPasswordCardView = ViewBindings.findChildViewById(rootView, id);
      if (ForgotPasswordCardView == null) {
        break missingId;
      }

      id = R.id.backButton;
      ImageView backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.reset_email;
      EditText resetEmail = ViewBindings.findChildViewById(rootView, id);
      if (resetEmail == null) {
        break missingId;
      }

      id = R.id.send_reset_button;
      Button sendResetButton = ViewBindings.findChildViewById(rootView, id);
      if (sendResetButton == null) {
        break missingId;
      }

      id = R.id.text;
      TextView text = ViewBindings.findChildViewById(rootView, id);
      if (text == null) {
        break missingId;
      }

      return new ActivityForgotPasswordBinding((ConstraintLayout) rootView, ForgotPasswordCardView,
          backButton, resetEmail, sendResetButton, text);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
