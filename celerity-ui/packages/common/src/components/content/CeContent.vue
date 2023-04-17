<template>
  <div class="content">
    <slot></slot>
  </div>
</template>
<script setup>
</script>
<style lang="scss">
.content {
  height: max-content;
  width: 100%;
  padding: 0;
  padding: 10px 16px;
  //padding-top: 0;
  //padding-bottom: 24px;
  display: flex;
  flex-direction: column;
  overflow: auto;
}
</style>
