<template>
<div class="page-body">
<slot></slot>
</div>
</template>
<script setup>
</script>
<style lang="scss">
.page-body {
  height: 100%;
  flex-grow: 1;
  flex-shrink: 1;
  flex-basis: auto;
  overflow: auto;
  padding: 0;
}
</style>
