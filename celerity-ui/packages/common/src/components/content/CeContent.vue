<template>
  <div class="content">
    <slot></slot>
  </div>
</template>
<script setup>
</script>
<style lang="scss">
.content {
  height: min-content;
  width: 100%;
  padding: 0;
  padding: 0 20px 20px;
  display: flex;
  flex-direction: column;
  overflow: auto;
}
</style>
