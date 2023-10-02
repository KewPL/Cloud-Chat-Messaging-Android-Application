// Generated by view binder compiler. Do not edit!
package com.example.messagingapp.databinding;

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
import com.example.messagingapp.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySetupProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView3;

  @NonNull
  public final Button continueBtn;

  @NonNull
  public final CircleImageView imageView;

  @NonNull
  public final EditText nameBox;

  @NonNull
  public final TextView phoneLbl;

  @NonNull
  public final TextView textView2;

  private ActivitySetupProfileBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView cardView3, @NonNull Button continueBtn, @NonNull CircleImageView imageView,
      @NonNull EditText nameBox, @NonNull TextView phoneLbl, @NonNull TextView textView2) {
    this.rootView = rootView;
    this.cardView3 = cardView3;
    this.continueBtn = continueBtn;
    this.imageView = imageView;
    this.nameBox = nameBox;
    this.phoneLbl = phoneLbl;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySetupProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySetupProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_setup_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySetupProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView3;
      CardView cardView3 = ViewBindings.findChildViewById(rootView, id);
      if (cardView3 == null) {
        break missingId;
      }

      id = R.id.continueBtn;
      Button continueBtn = ViewBindings.findChildViewById(rootView, id);
      if (continueBtn == null) {
        break missingId;
      }

      id = R.id.imageView;
      CircleImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.nameBox;
      EditText nameBox = ViewBindings.findChildViewById(rootView, id);
      if (nameBox == null) {
        break missingId;
      }

      id = R.id.phoneLbl;
      TextView phoneLbl = ViewBindings.findChildViewById(rootView, id);
      if (phoneLbl == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new ActivitySetupProfileBinding((ConstraintLayout) rootView, cardView3, continueBtn,
          imageView, nameBox, phoneLbl, textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
