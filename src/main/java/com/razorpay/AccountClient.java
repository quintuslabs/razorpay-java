package com.razorpay;

import org.json.JSONObject;

import java.util.List;

public class AccountClient extends ApiClient {

  AccountClient(String auth) {
    super(auth);
  }

  public Account create(JSONObject request) throws RazorpayException {
    return post(Constants.ACCOUNT_CREATE, request);
  }

  public List<Account> fetchAll() throws RazorpayException {
    return fetchAll(null);
  }

  public List<Account> fetchAll(JSONObject request) throws RazorpayException {
    return getCollection(Constants.ACCOUNT_LIST, request);
  }

  public List<Account> fetchAll(String path, JSONObject request) throws RazorpayException {
    return getCollection(path, request);
  }

  public Account fetch(String id) throws RazorpayException {
    return get(String.format(Constants.ACCOUNT_GET, id), null);
  }
}
