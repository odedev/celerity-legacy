<template>
  <aside class="view-aside">
    <slot></slot>
  </aside>
  </template>
  <script setup>
  </script>
  <style lang="scss">
  .view-aside {
    height: 100%;
    width: 272px;
    flex-basis: 272px;
    flex-grow: 0;
    flex-shrink: 0;
    display: flex;
    flex-direction: column;
    padding: 0;
    border-right: 1px solid #f5f5f5;
  }
  </style>
