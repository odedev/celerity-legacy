<template>
<footer id="footer" class="footer">
<slot></slot>
</footer>
</template>
<script setup>

</script>
<style>
.footer {
  --footer-height: 24px;
  /* height: 20px; */
  height: var(--footer-height);
  flex-grow: 0;
  flex-shrink: 0;
  flex-basis: var(--footer-height);
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  align-items: center;
  font-size: 12px;
  line-height: 12px;
  padding: 0 8px;
  color: #263238;
  background-color: #CFD8DC;
  overflow: hidden;
}
.footer i {
  height: 16px;
}
</style>
