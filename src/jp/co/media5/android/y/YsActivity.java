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
 * Y����S����ʁi�ɂ��d��j
 *
 * @author Y
 */
public class YsActivity extends FragmentActivity {

	// �v�Z��
	private int calcCount;

	// �ϐ��l�ޔ�p�̃L�[
	private static final String SAVE_KEY_CALC_COUNT = "calcCount";

	// ��ʐ����C�x���g
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// ���̉�ʗp�̃��C�A�E�g��ǂݍ���
		setContentView(R.layout.activity_y);

		// �v�Z�񐔂�������
		if (savedInstanceState == null) {
			calcCount = 0;
		} else {
			calcCount = savedInstanceState.getInt(SAVE_KEY_CALC_COUNT);
		}

		// �{�^���������̃C�x���g��ݒ�
		findViewById(R.id.calc_button_zero).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// �Œ蕶����\��
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_zero);
					}
				}
		);
		findViewById(R.id.calc_button_one).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// �Œ蕶����\��
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_one);
					}
				}
		);
		findViewById(R.id.calc_button_two).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// �Œ蕶����\��
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_two);
					}
				}
		);
		findViewById(R.id.calc_button_three).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// �Œ蕶����\��
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_three);
					}
				}
		);
		findViewById(R.id.calc_button_four).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// �Œ蕶����\��
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_four);
					}
				}
		);
		findViewById(R.id.calc_button_five).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// �Œ蕶����\��
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_five);
					}
				}
		);
		findViewById(R.id.calc_button_six).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// �Œ蕶����\��
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_six);
					}
				}
		);
		findViewById(R.id.calc_button_seven).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// �Œ蕶����\��
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_seven);
					}
				}
		);
		findViewById(R.id.calc_button_eight).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// �Œ蕶����\��
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_eight);
					}
				}
		);
		findViewById(R.id.calc_button_nine).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// �Œ蕶����\��
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_nine);
					}
				}
		);
		findViewById(R.id.calc_button_point).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// �Œ蕶����\��
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_point);
					}
				}
		);
		findViewById(R.id.calc_button_add).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// �Œ蕶����\��
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_add);
					}
				}
		);
		findViewById(R.id.calc_button_subtract).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// �Œ蕶����\��
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_subtract);
					}
				}
		);
		findViewById(R.id.calc_button_multiply).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// �Œ蕶����\��
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_multiply);
					}
				}
		);
		findViewById(R.id.calc_button_divide).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// �Œ蕶����\��
						((TextView)findViewById(R.id.calc_display)).setText(R.string.calc_message_divide);
					}
				}
		);
		findViewById(R.id.calc_button_equal).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						// ��p���������s
						calculate();
					}
				}
		);
	}

	// �C���X�^���X��ԕۑ��C�x���g�i�������s�����ɔ����j
	@Override
	protected void onSaveInstanceState(Bundle outState) {

		// �ϐ��l��ޔ�
		outState.putInt(SAVE_KEY_CALC_COUNT, calcCount);

		super.onSaveInstanceState(outState);
	}

	// �C���X�^���X��ԕ����C�x���g
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);

		// �ϐ��l�𕜌�
		calcCount = savedInstanceState.getInt(SAVE_KEY_CALC_COUNT);
	}

	// �u���v�����������̏���
	private void calculate() {

		// �v�Z�񐔂ɉ������������擾
		String[] messages = getResources().getStringArray(R.array.calc_messages_equal);
		String message = messages[calcCount];

		// �v�Z�񐔂�����ɒB���Ă��Ȃ��ꍇ
		if (calcCount + 1 < messages.length) {

			// ��������ʕ\��
			((TextView)findViewById(R.id.calc_display)).setText(message);

			// �񐔂��J�E���g�A�b�v
			calcCount++;
		} else {

			// �������_�C�A���O�\�����ċ����I��
			DialogFragment dialog = new YsDialogFragment();
			Bundle bundle = new Bundle();
			bundle.putString(YsDialogFragment.BUNDLE_KEY_MESSAGE, message);
			dialog.setArguments(bundle);
			dialog.show(getSupportFragmentManager(), YsDialogFragment.TAG_ERROR_DIALOG);
		}
	}

	/**
	 * ���̉�ʐ�p�̃_�C�A���O�\���N���X
	 */
	public static class YsDialogFragment extends DialogFragment {

		/** �^�O�F�G���[�_�C�A���O */
		public static final String TAG_ERROR_DIALOG = "errorDialog";

		/** �p�����[�^���F�\������ */
		public static final String BUNDLE_KEY_MESSAGE = "message";

		// �_�C�A���O�����C�x���g
		@Override
		public Dialog onCreateDialog(Bundle bundle) {

			// �L�����Z���s��
			setCancelable(false);

			// ��������\���������擾
			String message = getArguments().getString(BUNDLE_KEY_MESSAGE);

			// �_�C�A���O�쐬����
			AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

			// ������ݒ�
			builder.setMessage(message);

			// OK�{�^����ݒ�
			builder.setPositiveButton(
					R.string.calc_error_dialog_button,
					new DialogInterface.OnClickListener() {

						// �{�^���������̏���
						@Override
						public void onClick(DialogInterface dialog, int which) {

							// ��ʂ������I��
							getActivity().finish();
						}
					}
			);

			// �_�C�A���O�𐶐����ĕԂ�
			return builder.create();
		}
	}
}
