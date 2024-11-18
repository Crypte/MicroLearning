/** @type {import('tailwindcss').Config} */
module.exports = {
  corePlugins: { preflight: false },
  content: [
    "./src/**/*.{html,ts}", // Chemin vers vos fichiers HTML et TypeScript
  ],
  theme: {
    extend: {
      fontFamily: {
        quagi: ['Quagi', 'sans-serif'], // Ajout de la police Quagi
      },
    },
  },
  plugins: [
    require('tailwind-scrollbar-hide')
  ],
}
