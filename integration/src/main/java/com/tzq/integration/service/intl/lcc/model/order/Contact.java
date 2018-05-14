package com.tzq.integration.service.intl.lcc.model.order;

import java.io.Serializable;

/**
 * Created by cl24957 on 2018/5/12.
 */
public class Contact implements Serializable {
    private String name;
    private String address;
    private String postcode;
    private String email;
    private String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("            \"name\":\"").append(name).append('\"');
        sb.append(",             \"address\":\"").append(address).append('\"');
        sb.append(",             \"postcode\":\"").append(postcode).append('\"');
        sb.append(",             \"email\":\"").append(email).append('\"');
        sb.append(",             \"mobile\":\"").append(mobile).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
