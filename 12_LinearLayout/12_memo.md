�Q�{�^���������тɔz�u����Ă���Ƃ��܂��B�Е��̃{�^���ɂ̂�android:layout_weight="1"���w�肵�܂��B
�w�肵�Ă��Ȃ��{�^����android:layout_weight��0�Ƃ��Ĉ����܂��B
android:layout_weight�͎w�肳�ꂽ�l�����ɃX�y�[�X�����蓖�Ă܂��B���̗�ł͊��蓖�Ă���䗦��1:0�ƂȂ�܂��B
����āA�w�肳�ꂽ�{�^���͎c���Ă���X�y�[�X��S�Ďg�����ƂɂȂ�ڈ�t�������ɐL�т܂��B


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