２つボタンが横並びに配置されているとします。片方のボタンにのみandroid:layout_weight="1"を指定します。
指定していないボタンのandroid:layout_weightは0として扱われます。
android:layout_weightは指定された値を元にスペースを割り当てます。この例では割り当てられる比率は1:0となります。
よって、指定されたボタンは残っているスペースを全て使うことになり目一杯横方向に伸びます。


<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="horizontal" >

    <Button
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="Button1" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button2" />

</LinearLayout>