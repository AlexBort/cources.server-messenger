package com.softgroup.authorization.api.message;

import com.softgroup.common.protocol.ResponseData;

/**
 * @author odin
 * @since 20.02.17.
 */
public class RegisterResponse implements ResponseData {

	private static final long serialVersionUID = -5146888202653750948L;

	private String registrationRequestUuid; // uuid сессии регистрации
	private String registrationTimeoutSec; // секунд осталось до возможности повторной регистрации
	private String authCode;			// FIXME: 06.03.2017 authCode - только на начальном етапе. В будущем удалить."
	// код подтверждения

	public String getRegistrationRequestUuid() {
		return registrationRequestUuid;
	}

	public void setRegistrationRequestUuid(String registrationRequestUuid) {
		this.registrationRequestUuid = registrationRequestUuid;
	}

	public String getRegistrationTimeoutSec() {
		return registrationTimeoutSec;
	}

	public void setRegistrationTimeoutSec(String registrationTimeoutSec) {
		this.registrationTimeoutSec = registrationTimeoutSec;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
}
