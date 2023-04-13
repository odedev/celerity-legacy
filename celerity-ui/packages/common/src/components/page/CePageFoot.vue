<template>
<div class="page-foot">
<slot></slot>
</div>
</template>
<script setup>
</script>
<style lang="scss">
.page-foot {
  height: 60px;
  flex-grow: 0;
  flex-shrink: 0;
  flex-basis: 60px;
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  align-items: center;
  padding: 0 16px;
  /* border-top: 1px solid #f0f0f0; */
}
</style>
