<template>
  <main id="main">
    <slot></slot>
  </main>
</template>
<script setup>

</script>
<style lang="scss">
#main {
  width: 100%;
  height: 100%;
  flex-grow: 1;
  flex-shrink: 1;
  flex-basis: auto;
  display: flex;
  flex-direction: column;
  overflow: hidden;
}
</style>
