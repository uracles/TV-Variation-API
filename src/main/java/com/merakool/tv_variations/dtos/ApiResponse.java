package com.merakool.tv_variations.dtos;

//public class ApiResponse {
    public record ApiResponse<T>(int statusCode, String message, T data) {

        //why record instead of class?

}
