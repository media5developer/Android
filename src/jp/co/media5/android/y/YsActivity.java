package jp.co.media5.android.y;

import jp.co.media5.android.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Yさん担当画面（にせ電卓）
 *
 * @author Y
 */
public class YsActivity extends FragmentActivity {

	// 計算回数
	private int calcCount;

	// 変数値退避用のキー
	private static final String SAVE_KEY_CALC_COUNT = "calcCount";

	// 画面生成イベント
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// この画面用のレイアウトを読み込み
		setContentView(R.layout.activity_y);

		// 計算回数を初期化
		if (savedInstanceState == null) {
			calcCount = 0;
		} else {
			calcCount = savedInstanceState.getInt(SAVE_KEY_CALC_COUNT);
		}

		// ボタン押下時のイベントを設定
		findViewById(R.id.calc_button_zero).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// 固定文言を表示
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_zero);
					}
				}
		);
		findViewById(R.id.calc_button_one).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// 固定文言を表示
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_one);
					}
				}
		);
		findViewById(R.id.calc_button_two).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// 固定文言を表示
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_two);
					}
				}
		);
		findViewById(R.id.calc_button_three).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// 固定文言を表示
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_three);
					}
				}
		);
		findViewById(R.id.calc_button_four).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// 固定文言を表示
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_four);
					}
				}
		);
		findViewById(R.id.calc_button_five).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// 固定文言を表示
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_five);
					}
				}
		);
		findViewById(R.id.calc_button_six).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// 固定文言を表示
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_six);
					}
				}
		);
		findViewById(R.id.calc_button_seven).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// 固定文言を表示
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_seven);
					}
				}
		);
		findViewById(R.id.calc_button_eight).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// 固定文言を表示
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_eight);
					}
				}
		);
		findViewById(R.id.calc_button_nine).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// 固定文言を表示
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_nine);
					}
				}
		);
		findViewById(R.id.calc_button_point).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// 固定文言を表示
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_point);
					}
				}
		);
		findViewById(R.id.calc_button_add).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// 固定文言を表示
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_add);
					}
				}
		);
		findViewById(R.id.calc_button_subtract).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// 固定文言を表示
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_subtract);
					}
				}
		);
		findViewById(R.id.calc_button_multiply).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// 固定文言を表示
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_multiply);
					}
				}
		);
		findViewById(R.id.calc_button_divide).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// 固定文言を表示
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_divide);
					}
				}
		);
		findViewById(R.id.calc_button_equal).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// 専用処理を実行
						calculate();
					}
				}
		);
	}

	// インスタンス状態保存イベント（メモリ不足時に発生）
	@Override
	protected void onSaveInstanceState(Bundle outState) {

		// 変数値を退避
		outState.putInt(SAVE_KEY_CALC_COUNT, calcCount);

		super.onSaveInstanceState(outState);
	}

	// インスタンス状態復元イベント
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);

		// 変数値を復元
		calcCount = savedInstanceState.getInt(SAVE_KEY_CALC_COUNT);
	}

	// 「＝」を押した時の処理
	private void calculate() {

		// 計算回数に応じた文言を取得
		String[] messages = getResources().getStringArray(R.array.calc_messages_equal);
		String message = messages[calcCount];

		// 計算回数が上限に達していない場合
		if (calcCount + 1 < messages.length) {

			// 文言を画面表示
			((TextView)findViewById(R.id.calc_display)).setText(message);

			// 回数をカウントアップ
			calcCount++;
		} else {

			// 文言をダイアログ表示して強制終了
			DialogFragment dialog = new YsDialogFragment();
			Bundle bundle = new Bundle();
			bundle.putString(YsDialogFragment.BUNDLE_KEY_MESSAGE, message);
			dialog.setArguments(bundle);
			dialog.show(getSupportFragmentManager(), YsDialogFragment.TAG_ERROR_DIALOG);
		}
	}

	/**
	 * この画面専用のダイアログ表示クラス
	 */
	public static class YsDialogFragment extends DialogFragment {

		/** タグ：エラーダイアログ */
		public static final String TAG_ERROR_DIALOG = "errorDialog";

		/** パラメータ名：表示文言 */
		public static final String BUNDLE_KEY_MESSAGE = "message";

		// ダイアログ生成イベント
		@Override
		public Dialog onCreateDialog(Bundle bundle) {

			// キャンセル不可
			setCancelable(false);

			// 引数から表示文言を取得
			String message = getArguments().getString(BUNDLE_KEY_MESSAGE);

			// ダイアログ作成準備
			AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

			// 文言を設定
			builder.setMessage(message);

			// OKボタンを設定
			builder.setPositiveButton(
					R.string.calc_error_dialog_button,
					new DialogInterface.OnClickListener() {

						// ボタン押下時の処理
						@Override
						public void onClick(DialogInterface dialog, int which) {

							// 画面を強制終了
							getActivity().finish();
						}
					}
			);

			// ダイアログを生成して返す
			return builder.create();
		}
	}
}
