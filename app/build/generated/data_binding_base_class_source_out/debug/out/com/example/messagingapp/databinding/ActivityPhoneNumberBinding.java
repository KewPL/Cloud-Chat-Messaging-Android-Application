// Generated by view binder compiler. Do not edit!
package com.example.messagingapp.databinding;

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
import com.example.messagingapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPhoneNumberBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button continueBtn;

  @NonNull
  public final Button helpBtn;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final CardView margin;

  @NonNull
  public final EditText phoneBox;

  @NonNull
  public final TextView phoneLbl;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView4;

  private ActivityPhoneNumberBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button continueBtn, @NonNull Button helpBtn, @NonNull ImageView imageView,
      @NonNull ImageView imageView2, @NonNull CardView margin, @NonNull EditText phoneBox,
      @NonNull TextView phoneLbl, @NonNull TextView textView, @NonNull TextView textView2,
      @NonNull TextView textView4) {
    this.rootView = rootView;
    this.continueBtn = continueBtn;
    this.helpBtn = helpBtn;
    this.imageView = imageView;
    this.imageView2 = imageView2;
    this.margin = margin;
    this.phoneBox = phoneBox;
    this.phoneLbl = phoneLbl;
    this.textView = textView;
    this.textView2 = textView2;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPhoneNumberBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPhoneNumberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_phone_number, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPhoneNumberBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.continueBtn;
      Button continueBtn = ViewBindings.findChildViewById(rootView, id);
      if (continueBtn == null) {
        break missingId;
      }

      id = R.id.helpBtn;
      Button helpBtn = ViewBindings.findChildViewById(rootView, id);
      if (helpBtn == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.margin;
      CardView margin = ViewBindings.findChildViewById(rootView, id);
      if (margin == null) {
        break missingId;
      }

      id = R.id.phoneBox;
      EditText phoneBox = ViewBindings.findChildViewById(rootView, id);
      if (phoneBox == null) {
        break missingId;
      }

      id = R.id.phoneLbl;
      TextView phoneLbl = ViewBindings.findChildViewById(rootView, id);
      if (phoneLbl == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new ActivityPhoneNumberBinding((ConstraintLayout) rootView, continueBtn, helpBtn,
          imageView, imageView2, margin, phoneBox, phoneLbl, textView, textView2, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
