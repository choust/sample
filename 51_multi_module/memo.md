�P�A�A�v����V�����쐬����
	�V�����A�v�����쐬���ċN������� Hello World�@�Ƃ����������\�������Ǝv���܂��B

�Q�Alibrary���W���[����ǉ�����
	[File] -> [new] -> [New Module] -> Android library ��I������next�������܂�
	���O��mylibrary���w�肵�܂��B�f�B���N�g���p�X��K���ȏꏊ���w�肵�Ēǉ����Ă��������B

�R�Aapp���W���[���̈ˑ��ݒ��library���W���[����ǉ�����
	app/build.gradle
	dependencies {
	    implementation project(":mylibrary")

		�c�ȗ��c
	}
	
�S�Alibrary���W���[������Activity���쐬����
	library���W���[����src/main/java/�p�b�P�[�W��/LibActivity(��1)��ǉ����܂��B 
	AndroidStudio���p�ӂ��Ă��郁�j���[����Activity�𐶐�����ƃ��C�A�E�g�t�@�C���̗p�ӂ�AndroidManifest.xml�̕ύX������Ă����̂ŕ֗��ł��B
	��1: app���W���[���Ɠ������O��Activity��ǉ�����Ə�肭�����Ȃ��ł��B
	�����炭���O���d�������app���W���[���̃t�@�C����D�悵�ăr���h���Ă���̂�������܂���B
	
�T�A����m�F�̂���TextView��ǉ�����
	library���W���[����MainActivity�̃��C�A�E�gXML�ɓ���m�F�p��TextView��ǉ����Ă��������B
	
�U�Aapp�̃}�j�t�F�X�g�̃A�v���N�����ɕ\�������Activity��library�̂��̂ɏC������
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
	
�V�A����m�F
	�A�v�����N������library���W���[���ɒǉ�����Activity���\������Ă���Ζ��Ȃ��Ǝv���܂��B