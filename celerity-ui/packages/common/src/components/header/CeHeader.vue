<template>
  <header id="header" class="header">
    <slot></slot>
  </header>
</template>
<script setup>

</script>
<style>
.header {
  --header-height: 64px;
  width: 100%;
  height: var(--header-height);
  padding: 0 16px 0 0;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  flex-grow: 0;
  flex-shrink: 0;
  flex-basis: var(--header-height);
  font-size: 16px;
  line-height: 1.5;
  color: #ffffff;
  background-color: #13c2c2;
}
.header .logo {
  width: 208px;
  padding: 0 16px;
}
</style>
