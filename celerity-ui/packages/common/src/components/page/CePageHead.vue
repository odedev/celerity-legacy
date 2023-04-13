<template>
<div class="page-head">
  <slot></slot>
</div>
</template>
<script setup>
</script>
<style lang="scss">
.page-head {
  height: 60px;
  flex-grow: 0;
  flex-shrink: 0;
  flex-basis: 60px;
  display: flex;
  flex-direction: row;
  justify-content: flex-end;
  align-items: center;
  padding: 0 16px;
  /* border-bottom: 1px solid #f0f0f0; */
}
</style>
