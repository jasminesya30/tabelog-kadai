package com.example.tabelog.form;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class HouseRegisterForm {
	@NotBlank(message = "店舗名を入力してください。")
	private String name;

	private MultipartFile imageFile;

	@NotBlank(message = "説明を入力してください。")
	private String description;

	@NotNull(message = "料金目安を入力してください。")
	@Min(value = 1, message = "料金目安は1円以上に設定してください。")
	private Integer price;

	@NotNull(message = "座席数を入力してください。")
	@Min(value = 1, message = "座席数は1人以上に設定してください。")
	private Integer capacity;

	@NotBlank(message = "郵便番号を入力してください。")
	private String postalCode;

	@NotBlank(message = "住所を入力してください。")
	private String address;

	@NotBlank(message = "電話番号を入力してください。")
	private String phoneNumber;
}
