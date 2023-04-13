<template>
<div class="tab">
  <slot></slot>
</div>
</template>
<script setup>
</script>
<style lang="scss">
.tab {
  height: 48px;
  flex-grow: 0;
  flex-shrink: 0;
  flex-basis: 48px;
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  align-items: center;
  /*border-top: 1px solid #f5f5f5;*/
  font-size: 14px;
  padding: 0 8px;
}
</style>
