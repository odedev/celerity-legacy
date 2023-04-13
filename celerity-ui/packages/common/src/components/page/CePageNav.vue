<template>
  <div class="page-nav">
    <slot></slot>
  </div>
  </template>
  <script setup>
  </script>
  <style lang="scss">
  .page-nav {
    width: 100%;
    height: 32px;
    flex-basis: 32px;
    flex-grow: 0;
    flex-shrink: 0;
    display: flex;
    flex-direction: row;
    justify-content: flex-start;
    align-items: center;
    flex-wrap: nowrap;
    overflow: hidden;
    padding: 0 16px;
    font-size: 12px;
    line-height: 12px;
    border-bottom: 1px solid #f5f5f5;
  }
  </style>
