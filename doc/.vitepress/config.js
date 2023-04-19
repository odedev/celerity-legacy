const nav = [
  {
    text: '手册',
    link: '/manual/',
    activeMatch: '^/manual/'
  },
  {
    text: 'API',
    link: '/api/',
    activeMatch: '^/api/'
  },
  {
    text: '开发',
    link: '/dev/',
    activeMatch: '^/dev/'
  },
  {
    text: '核心模块',
    link: '/core/',
    activeMatch: '^/core/'
  },
]


const sidebar = {
  '/manual/': [
    {
      text: '开始',
      collapsed: false,
      items: [
        { text: '介绍', link: '/manual/introduction' },
        { text: '概览', link: '/manual/overview' },
        { text: '指南', link: '/manual/guide' },
      ]
    },
    {
      text: '架构设计',
      collapsed: false,
      items: [
        { text: '架构', link: '/manual/architecture' },
        { text: 'FAQ', link: '/manual/faq' },
      ]
    },
    {
      text: '部署',
      collapsed: false,
      items: [
        { text: '端口', link: '/manual/port' },
        { text: '安装', link: '/manual/install' },
      ]
    },
  ],
  '/api/': [
    {
      text: 'API',
      collapsed: false,
      items: [
        { text: 'api', link: '/api/index' },
      ]
    },
  ],
  '/dev/': [
    {
      text: 'DEV',
      collapsed: false,
      items: [
        { text: 'index', link: '/dev/index' },
      ]
    },
  ],
  '/core/': [
    {
      text: '核心模块',
      collapsed: false,
      items: [
        { text: '用户管理', link: '/core/user' },
        { text: '系统管理', link: '/core/system' },
      ]
    },
  ],
}

export default {
  // site-level options
  title: 'Celerity Doc',
  description: 'Celerity Doc.',
  lang: 'zh-CN',
  srcDir: './src',
  scrollOffset: 'header',
  themeConfig: {
    // theme-level options
    nav,
    sidebar,
    docsDir: 'src',
    outDir: 'dist',
  }
}
