■テキスト ボックスを追加する
１、最初に、レイアウトに既に適用されている制約を削除する必要があります。[Component Tree] ウィンドウの [TextView] をクリックしてから Delete キーを押します。
２、左側の [Palette] ウィンドウで、左のパネルの [Text] をクリックしてから、[Plain Text] をデザイン エディタにドラッグし、レイアウトの上部近くにドロップします。これは、書式なしテキストの入力を受け入れる EditText ウィジェットです。
３、デザイン エディタでビューをクリックします。ここで、4 つの角にサイズ変更ハンドル（正方形）が表示され、4 つの側面に制約アンカー（円）が表示されます。
	より細かくコントロールするには、ツールバーのボタンを使用して、エディタで拡大します。

４、上部のアンカーを押し続けながらレイアウトの上部にスナップするまでドラッグしてから放します。これで制約が適用されました。ビューをレイアウトの上部から 16dp 離れた位置に配置するように指定されます（デフォルトのマージンを 16dp に設定したため）。
５、同じようにして、ビューの左側からレイアウトの左側に対して制約を適用します。

■ボタンを追加する
１、[Palette ] ウィンドウで、左のパネルの [Buttons] をクリックしてから、[Button] をデザイン エディタにドラッグし、レイアウトの右側近くにドロップします。
２、ボタンの左側からテキスト ボックスの右側に対して制約を適用します。
３、水平方向に配置されたビューに制約を適用するには、テキスト ベースラインの間に制約を作成する必要があります。この制約を作成するには、ボタンをクリックしてから、デザイン エディタ内の選択したビューのすぐ下に表示される [Edit Baseline] を  クリックします。ボタン内にベースライン アンカーが表示されます。このアンカーを押し続けながらテキスト ボックス内に表示されるベースライン アンカーにドラッグします。

■UI 文字列を変更する


■テキスト ボックスのサイズを柔軟にする

１、両方のビューを選択してから（1 つのビューを選択してから、Shift キーを押しながらもう 1 つのビューをクリックします）、いずれかのビューを右クリックして、[Chain > Create Horizontal Chain] を選択します。
	チェーンは複数のビュー間の双方向の制約であり、チェーンで連結されたビューを揃えて配置することができます。

２、ボタンを選択し、[Attributes] ウィンドウを開きます。[Attributes] ウィンドウの最上部にあるビュー インスペクターを使用して、右マージンを 16 に設定します。
３、次にテキスト ボックスをクリックして、その属性を確認します。幅インジケーターを 2 回クリックして、 [Match Constraints] に 設定 します。
	「Match Constraints」とは、水平の制約とマージンによって幅が決定されることを意味します。したがって、テキスト ボックスが引き延ばされて、水平方向のスペースを埋めています（ボタンとすべてのマージンを考慮した後）。
	
これでレイアウトが完了。

----------------------------------------
activity を作成する

１、[Project] ウィンドウで app フォルダを右クリックし、[New] > [Activity] > [Empty Activity] を選択します。
２、[Configure Activity] ウィンドウの [Activity Name] に「DisplayMessageActivity」と入力し、[Finish] をクリックします（他のすべてのプロパティはデフォルトのままにします）。

	Android Studio は自動的に次の 3 つの処理を実行します。

		DisplayMessageActivity.java ファイルを作成する。
		対応するレイアウト ファイル activity_display_message.xml を作成する。
		必要な <activity> 要素を AndroidManifest.xml に追加する。
	

---------------------------------------
「Send」ボタンのオンクリックイベント

３、「DisplayMessageActivity」のテキストビューを追加する


４、ボタンをタップする時の　sendMessage() メソッドを作成する
	app > java > com.example.myfirstapp > MainActivity.java ファイルで、sendMessage() メソッドを追加します。

	このメソッドは以下を宣言する必要があります。

	パブリック アクセス
	戻り値型が void であること
	View のみをパラメータとして持つこと（これはクリックされた View オブジェクトです）


５、activity_main.xml ファイルに戻り、
	Layout Editor でボタンをクリックして選択します。
	[Attributes] ウィンドウで、[onClick] プロパティを見つけ、プルダウン リストから [sendMessage [MainActivity]] を選択します。
	
６、メッセージを表示する処理
	DisplayMessageActivity.java で、1 つ目の activity から渡されたメッセージを表示するように修正します。
	

----------------------------------------
Up ナビゲーションを追加する

app > Manifests > AndroidManifest.xml ファイルを開き、DisplayMessageActivity の <activity> タグを見つけて、次のコードに置き換えます。

	<activity android:name=".DisplayMessageActivity"></activity>
	
	↓↓↓↓↓↓
	
    <activity android:name=".DisplayMessageActivity"
                android:parentActivityName=".MainActivity">
        <!-- The meta-data tag is required if you support API level 15 and lower -->
        <meta-data
            android:name="android.support.PARENT_ACTIVITY"
            android:value=".MainActivity" />
    </activity>


完了。