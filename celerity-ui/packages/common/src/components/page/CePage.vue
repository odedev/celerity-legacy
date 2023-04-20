<template>
<div class="page">
  <slot></slot>
</div>
</template>
<script setup>
</script>
<style lang="scss">
.page {
  height: 100%;
  width: 100%;
  padding: 16px;
  background-color: #f5f5f5;
  background-color: #F8F8F8;
  overflow: hidden;

  flex-basis: auto;
  flex-grow: 1;
  flex-shrink: 1;
  // display: flex;
  // flex-direction: row;
  // justify-content: flex-start;
}
</style>
