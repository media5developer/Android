package jp.co.media5.android.i;

import jp.co.media5.android.R;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Iさん担当画面
 */
public class IsActivity extends FragmentActivity {

	/**
	 * アクティビティの作成
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// ビューの表示
		setContentView(R.layout.activity_i);

		// ボタン押下時のイベントを設定
		findViewById(R.id.i_button_dialog).setOnClickListener(
			new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					// ダイアログ表示
					showDialog();
				}
			}
		);

		// WebView表示
		findViewById(R.id.i_button_webview).setOnClickListener(
			new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					// ダイアログ表示
					showWebView();
				}
			}
		);

	}

	// ダイアログ表示
	private void showDialog() {
		AlertDialog.Builder dia = new AlertDialog.Builder(this);
		dia.setTitle(R.string.i_dialog_title);
		dia.setMessage(R.string.i_dialog_message);
		dia.setPositiveButton(R.string.i_dialog_ok,null);
		dia.show();
	}

	// WebView表示
	@SuppressLint({"NewApi", "SetJavaScriptEnabled", "InlinedApi"  })
	private void showWebView() {
		final WebView wv = new WebView(this);
		// JavaScriptを有効
		wv.getSettings().setJavaScriptEnabled(true);
		// キャッシュクリア
		wv.clearCache(true);
		// 背景透過
		wv.setBackgroundColor(0);
		wv.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
		// URL設定
		wv.loadUrl(getString(R.string.i_webview_url));

		// プログレスダイアログ
		final ProgressDialog loading = new ProgressDialog(this){
			// 戻るキー押下イベント
			public void onBackPressed() {
				wv.stopLoading();
				wv.goBack();
				cancel();
				// 前のActivityに戻る
				finish();
			};
		};
		// メッセージ
		loading.setMessage(getString(R.string.i_webview_loadingMsg));
		// 円スタイル
		loading.setProgressStyle(ProgressDialog.STYLE_SPINNER);

		WebViewClient client = new WebViewClient() {
			// HTMLページがすべて読み込み完了したイベント
			public void onPageFinished(final WebView view, final String url) {
				if (loading.isShowing()) {
					// プログレスダイアログ閉じる
					loading.dismiss();
				}
			};

			// 読み込み開始イベント
			public void onPageStarted(WebView view, String url, android.graphics.Bitmap favicon) {
				// プログレスダイアログ表示
				loading.show();
			};
		};

		WebChromeClient chrome = new WebChromeClient() {
			public void onProgressChanged(WebView view, int progress) {
				loading.setProgress(progress);
			}
		};

		wv.setWebViewClient(client);
		wv.setWebChromeClient(chrome);

		setContentView(wv);
	}

}
