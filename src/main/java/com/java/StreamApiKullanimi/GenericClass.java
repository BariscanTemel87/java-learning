package com.java.StreamApiKullanimi;

/*
 * Stream API Kullanımı
 */
public class GenericClass<T> {
 private T genericField;

 public GenericClass(T genericField) {
  this.genericField = genericField;
 }

 public void printGenericField() {
  System.out.println("Generic Field: " + genericField);
 }
}
