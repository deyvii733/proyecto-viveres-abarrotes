# Mercado Norte Android

## Fase 1: estructura

La aplicación nativa usa Kotlin, Jetpack Compose y una separación por capas:

- `domain/`: reglas y modelos del negocio, sin dependencias de Android.
- `data/`: persistencia local, sincronización y fuentes de datos.
- `ui/`: pantallas, navegación y estado visual.
- `security/`: autenticación, permisos y dispositivos autorizados.
- `features/`: módulos POS, inventario, compras, jornadas y reportes.

## Fases siguientes

1. Autenticación local segura y roles.
2. Base de datos Room y modelos de inventario.
3. POS, cámara y lector de códigos.
4. Compras, costos, márgenes y redondeo.
5. Jornadas, caja y reportes.
6. Sincronización cifrada entre los tres dispositivos.
7. Pruebas y generación del APK firmado.

La PWA de la raíz se conserva como versión web publicada. El APK se construirá desde este módulo `android/`.
