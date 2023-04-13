<template>
  <div class="logo">
    <slot></slot>
  </div>
</template>
<script setup>
</script>
<style lang="scss">
.logo {
  height: inherit;
  width: 208px;
  padding: 0 16px;
  display: flex;
  justify-content: flex-start;
  align-items: center;
  overflow: hidden;
}
</style>
