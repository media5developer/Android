package jp.co.media5.android;

import jp.co.media5.android.i.IsActivity;
import jp.co.media5.android.k.KsActivity;
import jp.co.media5.android.y.YsActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * ���C�����
 */
public class MainActivity extends Activity {

	// ��ʐ����C�x���g
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// ���̉�ʗp�̃��C�A�E�g��ǂݍ���
		setContentView(R.layout.activity_main);

		// �{�^���������̃C�x���g��ݒ�
		findViewById(R.id.boot_button_i).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// I����S����ʂ��N��
						startActivity(new Intent(MainActivity.this, IsActivity.class));
					}
				}
		);
		findViewById(R.id.boot_button_k).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// K����S����ʂ��N��
						startActivity(new Intent(MainActivity.this, KsActivity.class));
					}
				}
		);
		findViewById(R.id.boot_button_y).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// Y����S����ʂ��N��
						startActivity(new Intent(MainActivity.this, YsActivity.class));
					}
				}
		);
	}
}
