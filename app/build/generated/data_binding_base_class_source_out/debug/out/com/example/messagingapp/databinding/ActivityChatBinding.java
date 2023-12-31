// Generated by view binder compiler. Do not edit!
package com.example.messagingapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.messagingapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityChatBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView attachment;

  @NonNull
  public final ImageView camera;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final EditText messageBox;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final ImageView sendBtn;

  private ActivityChatBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView attachment,
      @NonNull ImageView camera, @NonNull CardView cardView, @NonNull EditText messageBox,
      @NonNull RecyclerView recyclerView, @NonNull ImageView sendBtn) {
    this.rootView = rootView;
    this.attachment = attachment;
    this.camera = camera;
    this.cardView = cardView;
    this.messageBox = messageBox;
    this.recyclerView = recyclerView;
    this.sendBtn = sendBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_chat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.attachment;
      ImageView attachment = ViewBindings.findChildViewById(rootView, id);
      if (attachment == null) {
        break missingId;
      }

      id = R.id.camera;
      ImageView camera = ViewBindings.findChildViewById(rootView, id);
      if (camera == null) {
        break missingId;
      }

      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.messageBox;
      EditText messageBox = ViewBindings.findChildViewById(rootView, id);
      if (messageBox == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.sendBtn;
      ImageView sendBtn = ViewBindings.findChildViewById(rootView, id);
      if (sendBtn == null) {
        break missingId;
      }

      return new ActivityChatBinding((ConstraintLayout) rootView, attachment, camera, cardView,
          messageBox, recyclerView, sendBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
