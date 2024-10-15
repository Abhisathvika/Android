<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/img_13"
    tools:context=".ImplicitIntent">

    <Button
        android:id="@+id/url"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="LinkedIn URL"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintBottom_toTopOf="@+id/camera"
        android:layout_marginTop="150dp"
        android:layout_marginBottom="20dp"/>

    <Button
        android:id="@+id/camera"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Camera"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/url"
        android:layout_marginTop="20dp"
        />

    <Button
        android:id="@+id/gallery"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Gallery"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/camera"
        android:layout_marginTop="20dp"
         />

    <Button
        android:id="@+id/contacts"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Contact her"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/gallery"
        android:layout_marginTop="20dp"/>

    <Button
        android:id="@+id/Dial"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Dial"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/contacts"
        android:layout_marginTop="20dp" />

</androidx.constraintlayout.widget.ConstraintLayout>
