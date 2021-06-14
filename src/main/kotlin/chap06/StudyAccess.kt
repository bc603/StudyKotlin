package chap06

// 접근 제한자(Visibility Modifirer)
// 외부에서 클래스, 생성자, 프로퍼티, 함수 등을 이요할때 접근의 범위를 지정
// public, internal, protected, private
// 코틀린에서 기본 접근 제한자는 public

// Top-Level
// public(Default), private(동일 file 내에서만 접근 가능), internal 같은 mobulde내에서, protected (top-level에서는 사용 불가능)

// Class 멤버
// public(Default), private(동일 클래스에서만 접근 가능), protected (private + (외부 에서는)서브 클래스에서 사용 가능),
// internal(같은 모듈에 선언된 클래스에서 사용 가능)
class StudyAccess {
}