１、アプリを新しく作成する
	新しくアプリを作成して起動すると Hello World　という文字が表示されると思います。

２、libraryモジュールを追加する
	[File] -> [new] -> [New Module] -> Android library を選択してnextを押します
	名前はmylibraryを指定します。ディレクトリパスを適当な場所を指定して追加してください。

３、appモジュールの依存設定にlibraryモジュールを追加する
	app/build.gradle
	dependencies {
	    implementation project(":mylibrary")

		…省略…
	}
	
４、libraryモジュール内にActivityを作成する
	libraryモジュールのsrc/main/java/パッケージ名/LibActivity(※1)を追加します。 
	AndroidStudioが用意しているメニューからActivityを生成するとレイアウトファイルの用意やAndroidManifest.xmlの変更もやってくれるので便利です。
	※1: appモジュールと同じ名前でActivityを追加すると上手く動かないです。
	おそらく名前が重複するとappモジュールのファイルを優先してビルドしているのかもしれません。
	
５、動作確認のためTextViewを追加する
	libraryモジュールのMainActivityのレイアウトXMLに動作確認用のTextViewを追加してください。
	
６、appのマニフェストのアプリ起動時に表示されるActivityをlibraryのものに修正する
	app/AndroidManifest.XML
    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity android:name="com.example.tab.mylibrary.LibActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>
	
７、動作確認
	アプリを起動してlibraryモジュールに追加したActivityが表示されていれば問題ないと思います。