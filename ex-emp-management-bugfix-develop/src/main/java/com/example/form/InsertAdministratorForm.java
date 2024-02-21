package com.example.form;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	//入力値エラー処理を追加
	@NotBlank(message = "名前を入力してください")
	private String name;
	/** メールアドレス */
	//入力値エラー処理を追加
	@NotBlank(message = "メールアドレスを入力してください")
	@Email(message = "メールアドレスの形式が不正です")
	private String mailAddress;
	/** パスワード */
	//入力値エラー処理を追加
	@NotBlank(message = "パスワードを入力してください")
	private String password;

	//確認用パスワードを追加
	/** 確認用パスワード */
	@NotBlank(message = "確認用パスワードを入力してください")
	@NotBlank(message = "パスワードと確認用パスワードが一致しません")
	private String confirmPassword;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + "]";
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
}
