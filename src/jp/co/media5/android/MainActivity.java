package jp.co.media5.android;

import jp.co.media5.android.i.IsActivity;
import jp.co.media5.android.k.KsActivity;
import jp.co.media5.android.y.YsActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * メイン画面
 */
public class MainActivity extends Activity {

	// 画面生成イベント
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// この画面用のレイアウトを読み込み
		setContentView(R.layout.activity_main);

		// ボタン押下時のイベントを設定
		findViewById(R.id.boot_button_i).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// Iさん担当画面を起動
						startActivity(new Intent(MainActivity.this, IsActivity.class));
					}
				}
		);
		findViewById(R.id.boot_button_k).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// Kさん担当画面を起動
						startActivity(new Intent(MainActivity.this, KsActivity.class));
					}
				}
		);
		findViewById(R.id.boot_button_y).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// Yさん担当画面を起動
						startActivity(new Intent(MainActivity.this, YsActivity.class));
					}
				}
		);
	}
}
