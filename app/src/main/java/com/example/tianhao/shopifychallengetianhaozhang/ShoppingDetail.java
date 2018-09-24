package com.example.tianhao.shopifychallengetianhaozhang;

public class ShoppingDetail {

    private String id;
    private String title;
    private String body_html;
    private String vendor;
    private String product_type;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody_html() {
        return body_html;
    }

    public String getVendor() {
        return vendor;
    }

    public String getProduct_type() {
        return product_type;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getHandle() {
        return handle;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getPublished_at() {
        return published_at;
    }

    public String getTemplate_suffix() {
        return template_suffix;
    }

    public String getTags() {
        return tags;
    }

    public String getPublished_scope() {
        return published_scope;
    }

    public String getAdmin_graphql_api_id() {
        return admin_graphql_api_id;
    }

    public variants getVariantsZero() {
        return VariantsZero;
    }

    public variants getVariantsOne() {
        return VariantsOne;
    }

    public options getOptionsZero() {
        return optionsZero;
    }

    public imagesTotal getImages() {
        return images;
    }

    public imagesTotal getImage1() {
        return image1;
    }

    public ShoppingDetail(String id, String title, String body_html, String vendor, String product_type, String created_at, String handle, String updated_at, String published_at, String template_suffix, String tags, String published_scope, String admin_graphql_api_id, variants variantsZero, variants variantsOne, options optionsZero, imagesTotal images, imagesTotal image1) {
        this.id = id;
        this.title = title;
        this.body_html = body_html;
        this.vendor = vendor;
        this.product_type = product_type;
        this.created_at = created_at;
        this.handle = handle;
        this.updated_at = updated_at;
        this.published_at = published_at;
        this.template_suffix = template_suffix;
        this.tags = tags;
        this.published_scope = published_scope;
        this.admin_graphql_api_id = admin_graphql_api_id;
        VariantsZero = variantsZero;
        VariantsOne = variantsOne;
        this.optionsZero = optionsZero;
        this.images = images;
        this.image1 = image1;
    }

    private String created_at;
    private String handle;
    private String updated_at;
    private String published_at;
    private String template_suffix;
    private String tags;
    private String published_scope;
    private String admin_graphql_api_id;
    variants VariantsZero;
    variants VariantsOne;
    options optionsZero;
    imagesTotal images;
    imagesTotal image1;



    private class imagesTotal {
        private String id;
        private String product_id;
        private String position;
        private String created_at;
        private String updated_at;
        private String alt;
        private String width;
        private String height;
        private String published_at;
        private String template_suffix;
        private String src;
        private String admin_graphql_api_id;
    }

    private class options{
        private String id;
        private String product_id;
        private String name;
        private String position;
        values valuesZero;
        values valuesOne;
    }
    private class values{
        private String zero;
        private String one;
    }
    private class variants{
        private String id;
        private String product_id;
        private String title;
        private String price;
        private String sku;
        private String position;
        private String inventory_policy;
        private String compare_at_price;
        private String fulfillment_service;
        private String inventory_management;
        private String option1;
        private String option2;
        private String option3;
        private String created_at;
        private String updated_at;
        private String taxable;
        private String barcode;
        private String grams;
        private String image_id;
        private String inventory_quantity;
        private String weight;
        private String weight_unit;
        private String inventory_item_id;
        private String old_inventory_quantity;
        private String requires_shipping;
        private String admin_graphql_api_id;
    }





}
